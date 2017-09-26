public class Main56 {

	public static List<Interval> merge(List<Interval> intervals) {

		List<Interval> result = new ArrayList<Interval>();

		if (intervals == null || intervals.size() == 0) {
			return result;
		}

		Collections.sort(intervals, new Comparator<Interval>() {
			@Override
			public int compare(Interval i1, Interval i2) {
				if (i1.start != i2.start) {
					return i1.start - i2.start;
				} else {
					return i1.end - i2.end;
				}
			}
		});

		Interval pre = intervals.get(0);
		for (int i = 0; i < intervals.size(); i++) {
			Interval curr = intervals.get(i);
			if (curr.start > pre.end) {
				result.add(pre);
				pre = curr;
			} else {
				Interval meraged = new Interval(pre.start, Math.max(pre.end, curr.end));
				pre = meraged;
			}
		}
		return result;

	}
}