import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		/*
		 * 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
		 * 첫째 줄에 N이 주어진다. N은 항상 3×2k 수이다. (3, 6, 12, 24, 48, ...) (k ≤ 10)
		 * 첫째 줄부터 N번째 줄까지 별을 출력한다.
		 * 
		 * 24
		 * 
		 *                        *                        
		 *                       * *                       
		 *                      *****                      
		 *                     *     *                     
		 *                    * *   * *                    
		 *                   ***** *****                   
		 *                  *           *                  
		 *                 * *         * *                 
		 *                *****       *****                
		 *               *     *     *     *               
		 *              * *   * *   * *   * *              
		 *             ***** ***** ***** *****             
		 *            *                       *            
		 *           * *                     * *           
		 *          *****                   *****          
		 *         *     *                 *     *         
		 *        * *   * *               * *   * *        
		 *       ***** *****             ***** *****       
		 *      *           *           *           *      
		 *     * *         * *         * *         * *     
		 *    *****       *****       *****       *****    
		 *   *     *     *     *     *     *     *     *   
		 *  * *   * *   * *   * *   * *   * *   * *   * *  
		 * ***** ***** ***** ***** ***** ***** ***** *****	
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int lineCnt = N / 3;
		char[][] stars = new char[N][N * 2 - 1];
		
		for (int i = 0; i < stars.length; i++) {
			for (int j = 0; j < stars[0].length; j++) {
				stars[i][j] = ' ';
			}
		}
		
		drawTri(stars, lineCnt, 0, (N * 2 - 1) / 2);
		
		for (int i = 0; i < stars.length; i++) {
			for (int j = 0; j < stars[0].length; j++) {
				bw.write(stars[i][j]);
			}
			bw.newLine();
		}
		
		bw.flush();
	}
	
	private static void drawTri(char[][] stars, int n, int y, int x) {
		if (n == 1) {
			drawStar(stars, y, x);
		} else {
			drawTri(stars, n / 2, y, x);
			drawTri(stars, n / 2, y + (3 * n / 2), x - (3 * n / 2));
			drawTri(stars, n / 2, y + (3 * n / 2), x + (3 * n / 2));
		}
	}

	private static void drawStar(char[][] stars, int y, int x) {
		stars[y][x] = '*';
		stars[y + 1][x - 1] = '*';
		stars[y + 1][x + 1] = '*';
		stars[y + 2][x - 2] = '*';
		stars[y + 2][x - 1] = '*';
		stars[y + 2][x] = '*';
		stars[y + 2][x + 1] = '*';
		stars[y + 2][x + 2] = '*';
	}
}
