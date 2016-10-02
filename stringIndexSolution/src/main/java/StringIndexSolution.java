/**
 * Created by ScorpionOrange on 2016/10/01.
 */
public class StringIndexSolution {

    /**
     * 对于一个给定的 source 字符串和一个 target 字符串，你应该在 source 字符串中找出 target 字符串出现的第一个位置(从0开始)。
     * 如果不存在，则返回 -1。
     * 样例
     * 如果 source = "source" 和 target = "target"，返回 -1。
     * 如果 source = "abcdabcdefg" 和 target = "bcd"，返回 1。
     * Returns a index to the first occurrence of target in source,
     * or -1  if target is not part of source.
     * @param source string to be scanned.
     * @param target string containing the sequence of characters to match.
     */
    public int strStr(String source, String target) {
        //write your code here
        int result = -1;
        if(source == null || target == null){
            return -1;
        }
        else{
            result = source.indexOf(target);
            return result;
        }
    }
}
