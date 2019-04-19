// unit tests for the code in app.js

const assert = require('chai').assert;

const matvec = require('../app');

describe('MatVec', function() {

      it('adding vectors v + w', function(){
      let v = [1, 1, 1, 1];
      let w = [3, 3, 3, 3];

      //running addVec() function in app.js
      let result = matvec.addVec(v, w);
      assert.deepEqual(result, [4, 4, 4, 4]);
      });

      it('adding vectors v + w, including negatives', function(){
      let v = [-1, 2, 1, 1];
      let w = [5, 3, 0, 10];

      //running addVec() function in app.js
      let result = matvec.addVec(v, w);
      assert.deepEqual(result, [4, 5, 1, 11]);
      });



      it('dot product of vectors v and w', function() {
      let v = [1, 1, 1, 1];
      let w = [3, 3, 3, 3];

      let result = matvec.dProduct(v, w);
      assert.deepEqual(result, 12);
      });

      it('dot product of vectors v and w, including negative numbers', function() {
      let v = [-1, 2, 1, 1];
      let w = [5, 3, 0, 10];

      let result = matvec.dProduct(v, w);
      assert.deepEqual(result, 11);
      });


});
