function Vote(vote) {
    if (vote < 6.0)
        return "insufficient";
    else if (vote <= 6.9)
        return "sufficient";
    else if (vote >= 7.9)
        return "good";
    else
        return "adequate";
}