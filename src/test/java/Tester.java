import org.example.WorkerPhoneList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Tester {

    @Test
    void WorkerListTest(){
        WorkerPhoneList list = new WorkerPhoneList();
        list.add(23, "Mike", 4, "1213234424");
        list.add(23, "Mike", 4, "3424234324");
        list.add(23, "Mike", 4, "6575775674");

        Assertions.assertEquals("[1213234424, 3424234324, 6575775674]",
                list.findForID(23).getPhones().toString()
        );

        list.add(45, "Anna", 7, "4534567878");
        list.add(12, "Hanna", 13, "2345785689");

        Assertions.assertEquals(
                "WorkerPhoneList{[{key={ID=23, name='Mike', experience=4}, phones=[1213234424, 3424234324, 6575775674]}, {key={ID=45, name='Anna', experience=7}, phones=[4534567878]}, {key={ID=12, name='Hanna', experience=13}, phones=[2345785689]}]}",
                list.toString()
        );

        list.add(14, "Lars", 13, "2345785689");
        Assertions.assertEquals(
                "[{key={ID=12, name='Hanna', experience=13}, phones=[2345785689]}, {key={ID=14, name='Lars', experience=13}, phones=[2345785689]}]",
                list.findForExperience(13).toString()
        );

        Assertions.assertEquals(
                "[1213234424, 3424234324, 6575775674]",
                list.findForNamePhoneList("Mike").toString()
        );
    }
}
