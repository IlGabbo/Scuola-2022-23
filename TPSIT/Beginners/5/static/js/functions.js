function TimezoneHour(timezone, inputHour, inputMinute) {
    timezone.toLowerCase();
    let dt = luxon.DateTime.fromObject({hour: inputHour, minute: inputMinute}, {zone: luxon.DateTime.now().zoneName});
    switch (timezone) {
        case "new york":
            return dt.setZone("America/New_York");
        case "tokyo":
            return dt.setZone("Asia/Tokyo");
        case "moscow":
            return dt.setZone("Europe/Moscow");
    }
    return -1;
}