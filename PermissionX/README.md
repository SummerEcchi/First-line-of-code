# PermissionX

PermissionX 是一个简化 Android 运行时权限用法的开源库。

添加如下配置将 PermissionX 添加至你的项目当作：

```groovy
dependencies {
    ...
    implementation 'com.permissionx.guolindev:permissionx:1.0.0'
}
```

然后就可以使用如下语法结构来申请运行时权限了：

```kotlin
PermissionX.request(this,
                    Manifest.permission.CALL_PHONE,
                    Manifest.permission.READ_CONTACTS) { allGranted, deniedList -> 
    if (allGranted) {
        Toast.makeText(this, "All permissions are granted", Toast.LENGTH_SHORT).show()
    } else {
        Toast.makeText(this, "You denied $deniedList", Toast.LENGTH_SHORT).show()
    }
}


```