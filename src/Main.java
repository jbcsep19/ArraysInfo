public class Main {
    public static void main(String[] args){
        // Arrays can only have one data type (e.g. int, String, double, float)
        // Arrays need to have the number of elements set

        // Declaring arrays

        // Method 1
        // Type: String
        // Name: colors
        // Number of values: 3
        String[] colors = new String[3];

        // Method 2
        // Initializing the array with values
        String[] colors2 = {"blue", "orange", "yellow"};

        // Method 3
        String[] colors3 = new String[]{"blue", "orange", "yellow"};

        // Method 4
        String[] colors4 = new String[3];
        colors4[0] = "blue";
        colors4[1] = "orange";
        colors4[2] = "yellow";

        // arrayname[index]
        // Indices start at 0 for arrays
        // Last index is the length of arrays-1

        // Get the length of array (how many items)
        int arraySize = colors4.length;

        // Printing the array
        for(int index = 0; index < colors4.length; index++){
            // colors4[index] Get me the value in the
            // colors4 array with an index of _(0,1,2)
            System.out.println(colors4[index]);
        }


    }
}
