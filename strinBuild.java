public class strinBuild {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("roshan");
        System.out.println(sb);
        // using charAt ()
        System.out.println(sb.charAt(3));

        // change or set char at index
        sb.setCharAt(3, 'p');
        System.out.println(sb);
    
        // insert char at index
        sb.insert(4, 'a');
        System.out.println(sb);

        // delete char at index
        sb.delete(4, 5);
        System.out.println(sb);

        //lenght
        System.out.println(sb.length());
}
    
}
