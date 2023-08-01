package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface <T>{
    boolean theSameAs(T newThem);
    boolean equals(Object o);
}
