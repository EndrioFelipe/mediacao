var $array = [];
$('div').each(function(){
    var id = $(this).attr('id');
    $array.push(id);
});
console.log($array);