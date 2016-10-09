package onboarding.misc;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class sortDates {
	enum DAY {
		MON("Monday"), TUE("Tuesday"), WED("Wednesday"), THU("Thurday"), FRI(
				"Friday"), SAT("Saturday"), SUN("Sunday");
		String m_name;
		DAY(String name) {
			m_name = name;
		}
	}

	public static void sortDates(List<DAY> dayList) {
		Set<DAY> set = new TreeSet<DAY>(dayList);
		for (DAY day : set) {
			System.out.println(day);
		}
	}

	public static void main(String[] args) {
		sortDates(Arrays.asList(new DAY[] { DAY.MON, DAY.WED, DAY.TUE, DAY.THU,
				DAY.SUN, DAY.SAT }));
	}

}
