public class Loop1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for(int i=1;i<=10;i++){
            if(N>=2 && N<=20){
               System.out.println(N+" x "+i+ " = "+ N*i); 
        }     
        }
        bufferedReader.close();
    }
}
