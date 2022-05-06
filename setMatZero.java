import java.util.Arrays;

public class setMatZero {
    public static void Solev(int[][] matrix){
        boolean[][] vis=new boolean[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0&&(!vis[i][j])){
                    for(int k=0;k<matrix[i].length;k++){
                        matrix[i][k]=0;
                        vis[i][k]=true;
                    }
                    for(int l=0;l<matrix.length;l++){
                        matrix[l][j]=0;
                        vis[l][j]=true;
                    }
                }
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
    public static void main(String[] args) {
         int[][] mat=new int[3][3];
         for(int i=0;i<3;i++){
             for(int j=0;j<3;j++){
                 mat[i][j]=i+1;
             }
         }
         mat[0][2]=0;
         mat[2][0]=0;
         System.out.println(Arrays.deepToString(mat));
         Solev(mat);
    }
}
