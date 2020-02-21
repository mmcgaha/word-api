package io.mmcgaha.wordly.tools;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.immutables.value.Value.Style;
import org.immutables.value.Value.Style.ImplementationVisibility;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Target({ElementType.PACKAGE, ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
@JsonSerialize
@Style(
    get = {"is*", "get*"},
    init = "set*",
    typeAbstract = {"Abstract*", "*IM"},
    typeImmutable = "*",
    optionalAcceptNullable = true,
    forceJacksonPropertyNames = false,
    visibility = ImplementationVisibility.SAME,
    jdkOnly = true
)
public @interface MMStyle {
}
