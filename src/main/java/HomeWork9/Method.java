package HomeWork9;

public class Method {
    public static int SIZE = 4; //заданный размер массива
    public static int sum (String[][]arr1) throws MyArraySizeException, MyArrayDataException {

        if(arr1.length != SIZE) throw new MyArraySizeException("Не соответствует размеру 4*4"); //выброс ошибки
        int sum = 0;
        for(int x = 0; x<arr1.length; x++){ //проходимся по массиву по вертикали и горизонтали
            if(arr1[x].length != SIZE) throw new MyArraySizeException("Массив должен быть размером 4 на 4 !"); //выброс ошибки при несоответствии размера


            for(int y = 0; y<arr1[x].length; y++){ //проходимся по массиву по вертикали и горизонтали
                try{        // пробуем
                    sum = sum + Integer.parseInt(arr1[x][y]); //переводим строку в число и суммируем данные массива
                } catch (NumberFormatException exception){  //ловим ошибку
                    throw new MyArrayDataException(String.format("Не удается преобразовать в число данные [%d] [%d]", x+1, y+1));//выброс ошибки
                }
            }
        }
        System.out.println("Сумма равняется: " + sum);
        return sum;
    }
}
