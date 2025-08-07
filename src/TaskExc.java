public class TaskExc {
    public static void main(String[] args) {
    //Задача
    //Напишите пример перехвата и обработки исключения с использованием собственных исключений.
    doSomething();
    }

    private static void doSomething() {
        try {
            new SomeEntity(-1, "anyName");
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    static class SomeEntity {
        int id;
        String name;

        public SomeEntity(int id) {
            validateIntId(id);
            this.id = id;
        }

        public SomeEntity(int id, String name) {
            validateIntId(id);
            this.id = id;
            this.name = name;
        }

        private void validateIntId(int id) {
            if (id < 0) {
                throw new BadValueException(String.valueOf(id));

            }
        }
    }

}
