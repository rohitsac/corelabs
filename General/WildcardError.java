import java.util.List;

public class WildcardError {

   /* void foo(List<?> i) {
        i.set(0, i.get(0));
    }*/

    private <T> void foo(List<T> l) {
		l.set(0, l.get(0));
	}
}