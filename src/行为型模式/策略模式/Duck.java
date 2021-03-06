package 行为型模式.策略模式;

public abstract class Duck {
    //属性:策略接口
    FlyBehavior flyBehavior;

    public Duck() {
    }

    public abstract void display();//显示鸭子信息

    public void quack(){
        System.out.println("鸭子嘎嘎叫~~");
    }

    public void swim(){
        System.out.println("鸭子会游泳~~");
    }

    public void fly(){
        if (flyBehavior!=null){
            flyBehavior.fly();
        }
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
