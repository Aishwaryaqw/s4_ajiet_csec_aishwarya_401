class Main {
    public static void main(String[] args) {
        StringBuilder q=new StringBuilder();
        q.append("hello");
        String temp = q.toString();
        q.reverse();
        String f=q.toString();
        System.out.println(f);
        int a=q.length();
        System.out.println(a);
        if(temp.equals(new StringBuilder(temp).reverse().toString())){
            System.out.println("it is a plaindrone");
        }else{
            System.out.println("it is not a plaindrone");
    }
    }
}
