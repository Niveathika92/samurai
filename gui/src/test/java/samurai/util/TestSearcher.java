package samurai.util;

import junit.framework.TestCase;

/**
 * <p>Title: Samurai</p>
 * <p/>
 * <p>Description: a thread dump analyzing tool</p>
 * <p/>
 * <p>Copyright: Copyright (c) 2003-2006</p>
 * <p/>
 * <p> </p>
 *
 * @author Yusuke Yamamoto
 * @version 2.0.5
 */
public class TestSearcher extends TestCase {
    public static void main(String[] args) {
        junit.textui.TestRunner.run(TestSearcher.class);
    }

    protected void setUp() throws Exception {
        super.setUp();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    String target = "a b c a";

    public void testSearchNext() {
//    SearchPanel searcher = new SearchPanel();
//    SearchResult result;
//    result = searcher.searchNextRegexp(target,"a",0);
//    assertTrue(result.found());
//    assertEquals(0,result.getStart());
//    assertEquals(1,result.getEnd());
//    result = searcher.searchNextRegexp(target,"a",1);
//    assertTrue(result.found());
//    assertEquals(6,result.getStart());
//    assertEquals(7,result.getEnd());
    }

    public void testSearchPrevious() {
//    SearchPanel searcher = new SearchPanel();
//    SearchResult result;
//    result = searcher.searchPreviousRegexp(target,"a",10);
//    assertTrue(result.found());
//    assertEquals(6,result.getStart());
//    assertEquals(7,result.getEnd());
//    result = searcher.searchPreviousRegexp(target,"a",5);
//    assertTrue(result.found());
//    assertEquals(0,result.getStart());
//    assertEquals(1,result.getEnd());
    }


}
