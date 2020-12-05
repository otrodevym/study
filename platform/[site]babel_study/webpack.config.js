const path = require('path');
const MiniCssExtractPlugin = require('mini-css-extract-plugin');
module.exports = {
  mode: 'development',
  // entry: path.join(__dirname, 'src', 'index'),
  entry: ["@babel/polyfill", path.join(__dirname, 'src/js', 'main.js'), "./src/sass/foo.sass"],
  // entry: './src/js/main.js',
  watch: true,
  output: {
    path: path.join(__dirname, 'dist'),
    publicPath: '/dist/',
    filename: "bundle.js",
    chunkFilename: '[name].js'
  },
  plugins: [
    new MiniCssExtractPlugin({filename: 'css/style.css'})
  ],
  module: {
    rules: [{
      test: /.jsx?$/,
      include: [
        path.resolve(__dirname, 'src')
      ],
      exclude: [
        path.resolve(__dirname, 'node_modules')
      ],
      loader: 'babel-loader',
      query: {
        presets: [
          ["@babel/env", {
            "targets": {
              "browsers": "last 2 chrome versions"
            }
          }]
        ]
      }
    },
    {
      test: /\.sass$/,
      use: [
        // "style-loader",
        MiniCssExtractPlugin.loader,
        "css-loader",
        "sass-loader"
      ],
      exclude: /node_modules/
    }
  ]
  },
  resolve: {
    extensions: ['.json', '.js', '.jsx']
  },
  devtool: 'source-map',
  devServer: {
    contentBase: path.join(__dirname, '/dist/'),
    inline: true,
    host: 'localhost',
    port: 8080,
  }
};