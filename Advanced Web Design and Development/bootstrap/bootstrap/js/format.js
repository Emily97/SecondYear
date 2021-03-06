function isValidDateFormat(dateString) {
    var regex = /^\d{2}-\d{2}-\d{4}$/;
    return dateString.match(regex);
}

function isValidEmailFormat(emailString) {
    var regex = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
    return emailString.match(regex);
}

function isValidURLFormat(urlString) {
    var regex = /((([A-Za-z]{3,9}:(?:\/\/)?)(?:[-;:&=\+\$,\w]+@)?[A-Za-z0-9.-]+|(?:www.|[-;:&=\+\$,\w]+@)[A-Za-z0-9.-]+)((?:\/[\+~%\/.\w-_]*)?\??(?:[-\+=&;%@.\w_]*)#?(?:[\w]*))?)/;
    return urlString.match(regex);
}

function isNumeric(n) {
    return !isNaN(parseFloat(n)) && isFinite(n);
}