package practice1;

public class Environment {
    public static void main(String[] args) {
        int x = 4; // {(x, 4)}
        int y = 5; // {(x, 4),(y, 5)} = r
        //closer? reduction? (evaluation계산)
        y = y + x; //{y + x}r
            // {5 + x}r
            // {5 + 4}r
            // 9r
            // {y = 9}r
            // {}{(x,4),(y,5)}

        {
            int z = 3; //{(z,3)} +r'
            int y = 4; //r'' = {(z,4), (y,4)} + r'
            y = x; //
            // {}{(z,3),(y= 4)} + r'
            //evaluate(c,r) = (c',r')
        }
        System.out.println(y);

    }
}
