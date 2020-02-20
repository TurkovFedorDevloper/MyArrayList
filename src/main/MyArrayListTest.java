package main;

public class MyArrayListTest {

    private String[] array = new String[10];
    private int size = 0;

    public void add(String s){
        array[size] = s;
        size++;
        if(size == array.length){
            String[] arrayX2 = new String[array.length * 2];
            for(int i = 0;i < array.length;i++){
                arrayX2[i] = array[i];
            }
            array = arrayX2;
        }
    }

    public void remove(int index){
        if(index >= 0 && index < size){
            for(int i = index;i < size - 1; i++){
                array[i] = array[i + 1];
            }
            size--;
        }
    }
    public void remove(String s){
        int index = -1;
        for(int i = 0;i < size;i++){
            if(s.equals(array[i])){
                index = i;
                break;
            }
        }
        if (index != -1){
            remove(index);
        }
    }

    public int getSize() {
        return size;
    }

    public String get(int index){
        if(index >= 0 && index < size){
            return array[index];
        }else {
            return "Элемент не найден";
        }
    }
}
