class robot{
    public void speak(String text){
        System.out.println("his voice is: " + text);
    }
    void  jump(int height){
        System.out.println("jumpping: " + height);
    }
    void move(double distance, String direction){
        System.out.println("moving: "+ distance + "meters in direction: " + direction);
    }
}
public class MethodPeramiteres {
    public static void main(String[] args) {
        robot gif = new robot();
        gif.speak("wooooo woooo");
        gif.jump(77);
        gif.move(33.3,"south");
        String a ="sdsdsdsdsd";
        gif.speak(a);

    }
}
