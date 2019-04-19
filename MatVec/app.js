//production code for matvec

module.exports = {

  addVec: function(v1, v2) {
    var w = [];

    for ( var i = 0; i < v1.length; i++ ) {
        w.push(v1[i] + v2[i]);
    }
    return w;
  },

  dProduct: function(v1, v2) {
    var w = 0;

    for ( var i = 0; i < v1.length; i++ ) {
      w = w + (v1[i] * v2[i])
    }
    return w;
  }

}
