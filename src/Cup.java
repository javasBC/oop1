public class Cup {
    //DATA
    String color="white";
    byte temp=2;
    boolean is_Empty=false;

    //FUNC
    void spell(){
        System.out.println("grab a napkin");
    }
    void drink(){
        System.out.println("drinking the coffee");
        is_Empty=true;
    }

    boolean isCupHot(byte newtemp){
        temp=newtemp;//2X  80V
        return temp>=40;
    }


}
