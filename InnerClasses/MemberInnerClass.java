// created inside a class and out of a method 

public class MemberInnerClass {
    int data = 100;

    public static void main(String[] args) {
        // MemberInnerClass mic = new MemberInnerClass();
        // MemberInnerClass.InnerMemberInnerClass imic = mic.new
        // InnerMemberInnerClass();
        MemberInnerClass.InnerMemberInnerClass imic = new MemberInnerClass().new InnerMemberInnerClass();
        imic.m();
    }

    public class InnerMemberInnerClass {
        void m() {
            System.out.println("data is : " + data);
        }

    }
}
