//
// Created by lingfengbuluo on 2016/10/20.
//

#include "hello.h"

JNIEXPORT jstring JNICALL Java_com_test_jni_HelloJni_getNativeStr
  (JNIEnv *env, jobject jobj){
     return (*env)->NewStringUTF(env,"hello form c!");
  }

/*
 * Class:     com_test_jni_HelloJni
 * Method:    setVlanId
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_com_test_jni_HelloJni_setVlanId
        (JNIEnv *env, jobject jobj, jint id){

}

/*
 * Class:     com_test_jni_HelloJni
 * Method:    getIsSucess
 * Signature: (Z)Z
 */
JNIEXPORT jboolean JNICALL Java_com_test_jni_HelloJni_getIsSucess
        (JNIEnv *env, jobject jobj, jboolean isSucess){

}