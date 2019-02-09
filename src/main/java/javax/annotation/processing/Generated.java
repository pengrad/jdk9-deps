package javax.annotation.processing;

public @interface Generated {
    String[] value();

    String date() default "";

    String comments() default "";
}