<template>
  <div class="container-fluid">
    <div class="row">
      <div class="col-12">

        <ul class="list-group">
          <li v-bind:key="p.name" v-for="p in people" class="list-group-item">

            <div class="row">
              <div class="col-2">
                <img v-bind:src="p.photo" class="img-thumbnail rounded-circle">
              </div>

              <div class="col-7">
                <div class="h4 mt-2">{{ p.name }}</div>
                <p>Antall lunsjer i november: <strong>67</strong></p>
              </div>

              <div class="col-3 d-flex align-items-center justify-content-center">
                <i class="fas fa-utensils fa-2x"></i>


                <!--
                  <div class="btn-group btn-group-lg" role="group">
                  <button type="button" class="btn">
                  <i class="fas fa-minus"></i>
                  </button>
                  <input type="text" value="1" class="text-center" style="width: 50px;">
                  <button type="button" class="btn">
                  <i class="fas fa-plus"></i>
                  </button>
                  </div>
                -->
              </div>
            </div>
          </li>
        </ul>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  data: function () {
    return {
      message: 'Hello Vue!',
      people: [
        {
          name: 'Mariann Orvedal',
          photo: 'assets/1.jpg'
        },
        {
          name: 'Eskil Bjerke',
          photo: 'assets/2.jpg'
        },
        {
          name: 'Marius Nettum',
          photo: 'assets/3.jpg'
        }
      ]
    }
  },
  props: {
    msg: String
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

body {
  background-color: slategray;
}

.list-group-item {
  margin-bottom: 7px;
}

.eaten {
  /*
  width: 50px;
  height: 50px;
   */
border: 4px solid gray;
border-radius: 25px;
}

i.fas {
  color: #c0c0c0;
  display: inline-block;
  border: 7px solid #c0c0c0;
  border-radius: 60px;
  box-shadow: 0px 0px 2px #c0c0c0;
  padding: 0.3em 0.4em;
}
</style>
