// class Solution {
//     public String interpret(String command) {
//         // G -> G
//         // () -> o
//         // (al) -> al
//         command = command.replace("()", "o");
//         command = command.replace("(al)","al");
//         return command;
// or
           // return command.replace("()", "o").replace("(al)", "al");

//     }
// }


// or
class Solution {
    public String interpret(String command) {
                int i = 0;
        StringBuilder answ = new StringBuilder();
        while (i < command.length())
        {
            switch (command.charAt(i))
            {
                case 'G':
                {
                    answ.append("G");
                    i++;
                    break;
                }
                case '(':
                {
                    if (command.charAt(i + 1) == ')')
                    {
                        i += 2;
                        answ.append("o");
                    }
                    else
                    {
                        i += 4;
                        answ.append("al");
                    }
                }
            }
        }
        return answ.toString();
    }
}