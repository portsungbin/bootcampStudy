package construct;

public class MethodInitMain3 {

    public static void main(String[] args) {
        Memberinit member1 = new Memberinit();
        member1.initMember(member1,"user1", 15, 90);

        Memberinit member2 = new Memberinit();
        member2.initMember(member2, "user2", 16, 80);

        Memberinit[] members = {member1, member2};

        for (Memberinit s : members) {
            System.out.println("이름: " + s.name + "나이: " + s.age + "성적: " + s.grade);
        }

    }
}
