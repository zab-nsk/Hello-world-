class Redis{
   public static void PrintText() {
            System.out.println("Hello world!");
        }

        public void PrintRe(){
            System.out.println("Почему он не работает?! ");
        }

    public static void main(String[]args){
        PrintText();
        Redis redis = new Redis();
        redis.PrintRe();

    }

}
