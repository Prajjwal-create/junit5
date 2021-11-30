package businesscode;

import java.util.List;
import java.util.stream.Collectors;

//[09:33] Rajshekar (Trainer)
//The @BeforeAll annotation denotes that the annotated method should be executed before all @Test, @RepeatedTest, @ParameterizedTest, and @TestFactory methods in the current class. It is executed only once.


public class MathUtils {
	
	public static Integer sum(List<Integer> vals) {

      var sum = vals.stream().reduce(Integer::sum);

       return sum.get();
		}

      public static List<Integer> positive(List<Integer> vals) {
     return vals.stream().filter(val -> val > 0).collect(Collectors.toList());

}

public static List<Integer> negative(List<Integer> vals) {

      return vals.stream().filter(val -> val < 0).collect(Collectors.toList());
		}

}
