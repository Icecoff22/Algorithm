public class Silver4_10828 {
    static int[] list;
	static int index = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		list = new int[10001];
        
        for (int i = 0; i < list.length; i++) {
            list[i] = -1;
        }
        
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();

			if ("push".equals(str)) {
				int number = Integer.parseInt(st.nextToken());
				push(number);
			}
			else if ("pop".equals(str)) {
                if (empty() == 1) {
					System.out.println(-1);
					continue;
				}
				pop();
			}
			else if ("size".equals(str)) {
				System.out.println(size());
			}
			else if ("empty".equals(str)) {
				System.out.println(empty());
			}
			else if ("top".equals(str)) {
				System.out.println(top());
			}
		}
	}

	public static void push(int number) {
		list[index++] = number;
	}

	public static void pop() {
		System.out.println(list[--index]);
		list[index] = -1;
	}

	public static int size() {
		return index;
	}

	public static int empty() {
		if (list[0] == -1) {
			return 1;
		}
		return 0;
	}

	public static int top() {
		if (index == 0) {
			return -1;
		}

		return list[index - 1];
	}
}