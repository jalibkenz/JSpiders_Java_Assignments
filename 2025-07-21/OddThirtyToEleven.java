class OddThirtyToEleven {

    static void oddThirtyToEleven() {
        for (int i = 30; i >= 11; i--) {
            if (i % 2 != 0) {
                System.out.println(i);

            }
        }
    }

    public static void main(String[] args) {
        oddThirtyToEleven();
    }
}
