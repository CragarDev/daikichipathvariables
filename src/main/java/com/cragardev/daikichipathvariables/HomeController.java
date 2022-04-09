package com.cragardev.daikichipathvariables;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    // From daikichi routes assignment
	// welcome route - ""  
    @RequestMapping("")
    public String welcome() {
        return "Welcome!";
    }

    // today route - /today
    @RequestMapping("/today")
    public String today() {
        return "Today you will find luck in all your endeavors!";
    }

    // tomorrow route - /tomorrow
    @RequestMapping("/tomorrow")
    public String tomorrow() {
        return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
    }

    // New routes added
    // action noun route - /congrats/{verb}/{noun}
    @RequestMapping("/congrats/{verb}/{noun}")
    public String congrats(@PathVariable("verb") String verb, @PathVariable("noun") String noun) {
        return "Thank you, for your " + verb + " with " + noun + ", next time it might be better!";
    }
    
    // travel route - /daikichi/travel/{city}
    @RequestMapping("/daikichi/travel/{city}")
    public String travel(@PathVariable("city") String city) {
    	return "Congratulations! you will soo travel to " + city+ "!";
    }

    // lotto route - /lotto/{number}
    @RequestMapping("/lotto/{number}")
    public String lotto(@PathVariable("number") int number) {
    	if (number % 2 == 0) {
    		return "You will take a grand journey in the near future, but be weary of tempting offers.";
    		
    	} else {
    		return "You have enjoyed the fruits of you labor but now is a great time to spend time with family and friends.";
    	}
    }
    
    // fortune quotes route - /fortune/{sel}
    @RequestMapping("/fortune/{sel}")

    public String fortune(@PathVariable("sel") int sel) {
        String message = "";
        switch (sel) {
            case 1:
                message = "Fortune favors the prepared mind."; // 1
                break;
            case 2:
                message = "I myself am good fortune."; // 2
                break;
            case 3:
                message = "Fortune and love favor the brave."; // 3
                break;
            case 4:
                message = "When fortune knocks open the door."; // 4
                break;
            case 5:
                message = "Success is the good fortune that comes from aspiration, desperation, perspiration, and inspiration."; // 5
                break;
            case 6:
                message = "Fortune befriends the bold."; // 6
                break;
            case 7:
                message = "Your faith is your fortune."; // 7
                break;
            case 8:
                message = "My good fortune lies in having found my life."; // 8
                break;
            case 9:
                message = "Fortune sides with him who dares."; // 9
                break;
            default:
                message = "Diligence is the mother of good fortune."; // 10
                break;
        }
        return message;
    }

}
