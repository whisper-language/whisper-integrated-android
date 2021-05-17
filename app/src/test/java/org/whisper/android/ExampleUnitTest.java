package org.whisper.android;

import net.crtrpt.whisper.EvalVisitor;
import net.crtrpt.whisper.Function;
import net.crtrpt.whisper.Scope;
import net.crtrpt.whisper.TLValue;
import net.crtrpt.whisper.gen.TLLexer;
import net.crtrpt.whisper.gen.TLParser;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class ExampleUnitTest {
    @Test
    public void testWhisper() {
        //执行
        TLLexer lexer = new TLLexer(CharStreams.fromString("println('hello whisper');"));
        TLParser parser = new TLParser(new CommonTokenStream(lexer));
        ParseTree tree =parser.parse();
        HashMap<String, Function> functions=new HashMap<>();
        EvalVisitor visitor = new EvalVisitor(new Scope(),functions);
        TLValue v= visitor.visit(tree);
    }
}