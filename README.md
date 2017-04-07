Kompilieren:

```
$ javac --module-source-path src/ -d out/modules $(find src -name '*.java')
```

Ausführen:
```
$ java --module-path out/modules --module com.example.main/com.example.main.Main
```

