package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class SkillsController {
    @GetMapping
    @ResponseBody
    public String home() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1 \n>" +
                "<h3>We have a few skills we want to learn. Here is the list</h3 \n>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>"+
                "</html>";
    }

    @GetMapping("/form")
    @ResponseBody
    public String skillsForm() {
        return "<html>\n" +
                "                <body>\n" +
                "                <form method=\"post\">" +
                "                <label for=\"name\">Enter your name:</label>\n" +
                "                <input name = \"name\" />\n" +
                "                <br />\n" +
                "                <label for=\"firstFavorite\">First Favorite</label>\n" +
                "                <select name= \"firstFavorite\">\n" +
                "                    <option></option>\n" +
                "                    <option value= \"JavaScript\"> JavaScript</option>\n" +
                "                    <option value= \"Java\"> Java</option>\n" +
                "                    <option value= \"Python\"> Python</option>\n" +
                "                </select>\"\n" +
                "                <br />\n" +
                "                <label for=\"secondFavorite\">Second Favorite</label>\n" +
                "                <select name= \"secondFavorite\">\n" +
                "                    <option></option>\n" +
                "                    <option value= \"JavaScript\"> JavaScript</option>\n" +
                "                    <option value= \"Java\"> Java</option>\n" +
                "                    <option value= \"Python\"> Python</option>\n" +
                "                </select>\"\n" +
                "                <br />\n" +
                "                <label for=\"thirdFavorite\">Third Favorite</label>\n" +
                "                <select name= \"thirdFavorite\">\n" +
                "                    <option></option>\n" +
                "                    <option value= \"JavaScript\"> JavaScript</option>\n" +
                "                    <option value= \"Java\"> Java</option>\n" +
                "                    <option value= \"Python\"> Python</option>\n" +
                "                </select>\n" +
                "                <br />\n" +
                "                <input type = \"Submit\" />\n" +
                "                </form>\n" +
                "                </body>\n" +
                "                </html>";


    }

    @PostMapping("/form")
    @ResponseBody
    public String formResponse(@RequestParam String name, @RequestParam String firstFavorite, @RequestParam String secondFavorite, @RequestParam String thirdFavorite) {
          return "<h1>"+ name +"</h1>" +
                  "<ol>" +
                  "<li>" + firstFavorite + "</li>" +
                  "<li>" + secondFavorite + "</li>" +
                  "<li>" + thirdFavorite + "</li>" +
                  "</ol>"
                  ;
    }
}
