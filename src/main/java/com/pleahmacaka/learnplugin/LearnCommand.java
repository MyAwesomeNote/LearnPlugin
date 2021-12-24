package com.pleahmacaka.learnplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("SpellCheckingInspection") // 맞춤법 검사 클래스 단위 비활성화 - IntellJ IDEA 기능
public class LearnCommand implements CommandExecutor { // implements를 사용하여 CommandExecutor를 불러옵니다. (인터페이스를 불러옵니다 / 당장은 모르셔도 됩니다)

    @Override // onCommand라는 함수를 오버라이드 합니다. 당장은 모르셔도 됩니다.
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) { // 여러가지 필요 요소들은 인자로 받습니다.
        /*
        * 인자 앞에 달려있는 @NotNull은 인자가 null(비어있음)일 수 없음을 알려줍니다.
        * CommandSender는 커맨드를 보낸 사람을 나타냅니다.
        * String[] args는 커맨드 인자에 대한 정보를 담고 있습니다.
        * ex) `/명령어 테스트 클래스`
        * 위와 같은 경우 args[0]은 "테스트"
        * args[1]은 "클래스" 입니다.
        * */
        if (sender instanceof Player || sender instanceof ConsoleCommandSender) { // 만약 sender(커맨드 사용자)가 Player 또는 ConsolecommandSender(콘솔)이(가) 아니면 아래 명령을 실행하지 않습니다.
            if (args.length == 0) { sender.sendMessage("명령어를 입력해주세요."); }  // 만약 args의 길이(명령어의 내용이 없으면)가 0이면 */명령어를 입력해달라는 메세지를 보냅니다.
        } 
        /* `/명령어 테스트` */
        else if (args[0].equalsIgnoreCase("테스트")) { sender.sendMessage("테스트 성공!"); }

        /* `/명령어 바보` */
        else if (args[0].equalsIgnoreCase("바보")) { sender.sendMessage("바보입니다.");

            /* `/명령어 바보 멍청이` */
            if (args[1].equalsIgnoreCase("멍청이")) { sender.sendMessage("멍청이입니다."); }
        }
        return true; // 명령어를 정확히 사용했다면 true, 아니라면 false를 반환하면 되지만 편의상 모두 true를 반환합니다.
    }
}
