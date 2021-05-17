增加本地maven仓库
```
// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        jcenter()
        mavenLocal()
    }
    dependencies {
        classpath "com.android.tools.build:gradle:4.0.0"

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        mavenLocal()
    }
}
```
app 增加依赖

```
implementation 'net.crtrpt:whisper:1.0-SNAPSHOT'
```

测试

```
TLLexer lexer = new TLLexer(CharStreams.fromString("println('hello whisper');"));
TLParser parser = new TLParser(new CommonTokenStream(lexer));
ParseTree tree =parser.parse();
HashMap<String, Function> functions=new HashMap<>();
EvalVisitor visitor = new EvalVisitor(new Scope(),functions);
TLValue v= visitor.visit(tree);
```