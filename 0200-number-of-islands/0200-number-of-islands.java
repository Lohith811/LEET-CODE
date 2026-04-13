import java.util.*;

class Solution {
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        int island = 0;
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(grid[i][j] == '0') continue;

                island++;
                grid[i][j] = '0';
                Queue<int[]> q = new LinkedList<>();
                q.offer(new int[]{i, j});

                while(!q.isEmpty()){
                    int[] cur = q.poll();
                    int curR = cur[0], curC = cur[1];

                    for(int k = 0; k < 4; k++){
                        int newR = curR + dx[k];
                        int newC = curC + dy[k];

                        if(newR < 0 || newC < 0 || newR >= row || newC >= col) continue;

                        if(grid[newR][newC] != '0'){
                            q.offer(new int[]{newR, newC});
                            grid[newR][newC] = '0';
                        }
                    }
                }
            }
        }
        return island;
    }
}