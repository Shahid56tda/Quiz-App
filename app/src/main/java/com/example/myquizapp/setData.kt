package com.example.myquizapp

object setData {
    const val name:String="name"
    const val score:String="score"
    fun getQuestion():ArrayList<QuestionData>{
        var que:ArrayList<QuestionData> =arrayListOf()
        var q1=QuestionData(
            "what is the capital of Pakistan ?",
            1,
            "Lahore",
            "Karachi",
            "fasilabad",
            "Islamabad",
            4
        )
        var q2=QuestionData(
            "National code of Pakistan is?",
            2,
                     "PAK",
                    "PK",
                    "PAK 1",
                     "None of them",
            2

        )
        var q3=QuestionData(
            "Which is the outermost planet in the solar system?",
            3,
            "Mercury",
            " Pluto",
            "Neptune",
            " Uranus",
            3
        )
        var q4=QuestionData(
            "How many crop season(s) does Pakistan have?",
            4,
            "1",
            "2",
            "3",
            "4",
            2
        )
        que.add(q1)
         que.add(q2)
         que.add(q3)
         que.add(q4)

        return que
    }
}