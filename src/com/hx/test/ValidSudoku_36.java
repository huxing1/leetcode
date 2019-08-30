package com.hx.test;

/**
 * 有效的数独
 */
public class ValidSudoku_36 {
    public static void main(String[] args) {
        char[][] a = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'1','9','8','.','.','.','.','6','.'},
                {'2','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        System.out.println(isValidSudoku(a));
    }
    public static boolean isValidSudoku(char[][] board) {
        // 记录某行，某位数字是否已经被摆放
        boolean[][] row=new boolean[9][9];
        // 记录某列，某位数字是否已经被摆放
        boolean[][] col=new boolean[9][9];
        // 记录某 3x3 宫格内，某位数字是否已经被摆放
        boolean[][] block=new boolean[9][9];
        for (int i=0;i<9;++i){
            for (int j=0;j<9;++j)
            {
                if (board[i][j] != '.')
                {
                    //找到对应的block块索引
                    int blockIndex = i / 3 * 3 + j / 3;
                    //因为索引都是0-9,所以需要减1
                    int num = board[i][j] - '1';
                    //当三个条件中，某一个为true就表示已存在num,则返回false
                    if (row[i][num] || col[j][num] || block[blockIndex][num])
                    {
                        return false;
                    }
                    else
                    {
                        row[i][num] = true;
                        col[j][num] = true;
                        block[blockIndex][num] = true;
                    }
                }
            }
        }
        return true;
    }
}
