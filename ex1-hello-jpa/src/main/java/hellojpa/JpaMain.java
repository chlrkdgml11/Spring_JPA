package hellojpa;

import hellojpa.Domain.Address;
import hellojpa.Domain.Member;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {


            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }


/*//        등록
        try {
            Team team = new Team();
            team.setName("Team1");
            em.persist(team);

            Member member1 = new Member();
            member1.setUsername("member1");
            member1.setTeam(team);
            em.persist(member1);

            Member member2 = new Member();
            member2.setUsername("member2");
            member2.setTeam(team);
            em.persist(member2);

            Member member3 = new Member();
            member3.setUsername("member3");
            member3.setTeam(team);
            em.persist(member3);

            em.flush();
            em.clear();

            Member findMember = em.find(Member.class, member1.getId());

            List<Member> members = findMember.getTeam().getMembers();

            for (Member m : members) {
                System.out.println("member : " + m.getUsername());
            }


            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }*/


/*//        수정
        try {
            Member findMember = em.find(Member.class, 1L);
            findMember.setName("Member1");

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }*/


/*//        삭제
        try {

            Member findMember = em.find(Member.class, 1L);
            em.remove(findMember);

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }*/

        emf.close();

    }
}
