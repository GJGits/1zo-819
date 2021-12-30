public class Snippet221 {
    
    public static void main(String[] args) {
        
        // A variable inside a method is not initialized by default 
        // so using a variable before it is initialized leads to an exception
        // at compilation time
        
        //int x;
        //int y = x + 1;

        // By default an integral literal is considered to be
        // an int from the compiler. If the variable is smaller
        // than an int the int will be casted to the smaller value
        // by the compiler. If the literal is too huge to fit into
        // the variable the compiler will raise a compilaer error
        // the same if the literal is too huge to be stored into an int
        
        byte a = 15;
        short b = 130;

        // byte x = 130; // does not compile since 130 cannot fit into a byte
        // long x = 5_000_000_000; // does not compile because 5_000_000_000 is to large for an int
        long c = 5_000_000_000L;

        // By default a floting number literal is considered to be a double. In this
        // case the compiler will not automatically cast the number

        //float x = 2.0; // does not compile because a double cannot fit into a floating point
        float d = 2.0F;

    }

}
