package org.example.aspects;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) // 메서드에만 붙일 수 있게 지정
@Retention(RetentionPolicy.RUNTIME) // 런타임에 읽히도록
public @interface ToLog {

}
