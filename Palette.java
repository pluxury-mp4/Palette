import java.util.Scanner;

public class Palette {
    Scanner scanner = new Scanner(System.in);
    int[][] arrays;
    int size = scanner.nextInt();
    int soloIndex;
    int Y,U,V,m;


    public Palette() {
        int[][] arrays = new int[size][3];
        this.arrays = arrays;
    }

public int[][] getRandom(){
    {
        for (int i  = 0; i < arrays.length  ; i++) {
            System.out.print(i +"(RGB)" + ". ");
            for (int j = 0; j < arrays[i].length; j++) {
                arrays[i][j] = (int)(Math.random()*256);
                System.out.print(" " + arrays[i][j] + " ");
            }
            System.out.println();
        }
    }

    return new int[size][3];
}


    public int[][] getPalette() {
        {
                for (int i  = 0; i < arrays.length  ; i++) {
                    System.out.print(i +"(RGB)" + ". ");
                    for (int j = 0; j < arrays[i].length; j++) {
                        System.out.print(" " + arrays[i][j] + " ");
                        Y = (int) (0.257 * arrays[i][j] + 0.504 * arrays[i][j] + 0.098 * arrays[i][j] +  arrays[i][j]);
                        U = (int) (-0.148 * arrays[i][j] - 0.291 * arrays[i][j] + 0.439 * arrays[i][j] + 128);
                        V = (int) ( 0.439 * arrays[i][j] - 0.368 * arrays[i][j] - 0.071 * arrays[i][j] + 128);
                    }
                    System.out.println();



                }
            }

        return new int[size][3];
    }

    public int[][] perevod(){
        System.out.print("Выберите индекс цвета: ");
        Scanner scanner = new Scanner(System.in);
        soloIndex = scanner.nextInt();
        getStar();
        {
            for (int i  = soloIndex; i < arrays.length  ; i+=arrays.length) {
                System.out.print(i +"(RGB)" + ". ");
                for (int j = 0; j < arrays[i].length; j++) {
                    System.out.print(" " + arrays[i][j] + " ");
                    Y = (int) (0.257 * arrays[0][0] + 0.504 * arrays[0][1] + 0.098 * arrays[0][2] + 16);
                    U = (int) (-0.148 * arrays[0][0] - 0.291 * arrays[0][1] + 0.439 * arrays[0][2] + 128);
                    V = (int) ( 0.439 * arrays[0][0] - 0.368 * arrays[0][1] - 0.071 * arrays[0][2] + 128);
                }
                System.out.print("   = " + Y + " " + U + " " + V + "(YUV)");
                System.out.println();
                getStar();


            }
        }
        return new int[size][3];
    }


    public void getInfo(){
        System.out.println("Содержание палитры цветов: ");
    }



    public int[][] getCollor() {
        System.out.print("Выберите индекс цвета: ");
        Scanner scanner = new Scanner(System.in);
        soloIndex = scanner.nextInt();
        getStar();
            {
                for (int i  = soloIndex; i < arrays.length  ; i+=arrays.length) {
                    System.out.print(i +"(RGB)" + ". ");
                    for (int j = 0; j < arrays[i].length; j++) {
                        System.out.print(" " + arrays[i][j] + " ");
                    }
                    System.out.println();
                    getStar();

                }
            }
            return new int[size][3];
        }


public int[][] getRed(){
    getStar();
    System.out.print("Введите число (не более 255 и не менее 0) \n на которое хотите заменить крассный элемент: ");
    Scanner scanner = new Scanner(System.in);
    int red = scanner.nextInt();

    if (red > 255){
        red = 255;
    }
    if (red < 0){
        red = 0;

    }
    arrays[soloIndex][0] = red;
    {
        for (int i  = soloIndex; i < arrays.length  ; i+=arrays.length) {
            System.out.print(i +"(RGB)" + ". ");
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.print(" " + arrays[i][j] + " ");
            }
            System.out.println();
            getStar();


        }
    }
    return new int[size][3];
}

    public int[][] getBlue(){
        getStar();
        System.out.print("Введите число (не более 255 и не менее 0) \n на которое хотите заменить синий элемент: ");
        Scanner scanner = new Scanner(System.in);
        int blue = scanner.nextInt();

        if (blue > 255){
            blue = 255;
        }
        if (blue < 0){
            blue = 0;

        }
        arrays[soloIndex][2] = blue;
        {
            for (int i  = soloIndex; i < arrays.length  ; i+=arrays.length) {
                System.out.print(i +"(RGB)" + ". ");
                for (int j = 0; j < arrays[i].length; j++) {
                    System.out.print(" " + arrays[i][j] + " ");
                }
                System.out.println();
                getStar();


            }
        }
        return new int[size][3];
    }

    public int[][] getGreen(){
        getStar();
        System.out.print("Введите число (не более 255 и не менее 0) \n на которое хотите заменить зеленый элемент: ");
        Scanner scanner = new Scanner(System.in);
        int green = scanner.nextInt();

        if (green > 255){
            green = 255;
        }
        if (green < 0){
            green = 0;

        }
        arrays[soloIndex][1] = green;
        {
            for (int i  = soloIndex; i < arrays.length  ; i+=arrays.length) {
                System.out.print(i +"(RGB)" + ". ");
                for (int j = 0; j < arrays[i].length; j++) {
                    System.out.print(" " + arrays[i][j] + " ");
                }
                System.out.println();
                getStar();

            }
        }
        return new int[size][3];
    }


    public void getStar(){
        for (int i=0;i < 25; i++){
            System.out.print("*");
        }
        System.out.println();
    }

    public void drop(){
        if (size == 0){
            System.exit(0);
        }
    }
}


