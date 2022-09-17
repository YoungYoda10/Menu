package com.menu.practicaltest.repository.retrofit;

public interface OnCallResponseType<T> {
    void onResult(T object);

    void onError(String err);
}
