class MyClass {

    @EnhancementRequest(
            id = 1,
            synopsis = "Add new feature to improve performance",
            engineer = "John Doe",
            date = "2023-10-01"
    )
    public void myMethod() {
        System.out.println("Executing myMethod...");
    }

    @EnhancementRequest(
            id = 2,
            synopsis = "Fix bug in the login process"
    )
    public void anotherMethod() {
        System.out.println("Executing anotherMethod...");
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.myMethod();
        myClass.anotherMethod();

        try {
            EnhancementRequest annotation = myClass.getClass()
                    .getMethod("myMethod")
                    .getAnnotation(EnhancementRequest.class);

            if (annotation != null) {
                System.out.println("Enhancement Request for myMethod:");
                System.out.println("ID: " + annotation.id());
                System.out.println("Synopsis: " + annotation.synopsis());
                System.out.println("Engineer: " + annotation.engineer());
                System.out.println("Date: " + annotation.date());
            }

            annotation = myClass.getClass()
                    .getMethod("anotherMethod")
                    .getAnnotation(EnhancementRequest.class);

            if (annotation != null) {
                System.out.println("\nEnhancement Request for anotherMethod:");
                System.out.println("ID: " + annotation.id());
                System.out.println("Synopsis: " + annotation.synopsis());
                System.out.println("Engineer: " + annotation.engineer());
                System.out.println("Date: " + annotation.date());
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}