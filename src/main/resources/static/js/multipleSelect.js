$(function () {
    $('select').multipleSelect({
        selectAll: true,
        onClose: function () {
            console.log("close selector.");
        }
    });
    $('select').multipleSelect("checkAll");
});